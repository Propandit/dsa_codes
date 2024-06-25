import requests
from bs4 import BeautifulSoup

# Send a GET request to the webpage you want to scrape
url = 'https://www.bbc.co.uk/news'
response = requests.get(url)

# Create a BeautifulSoup object to parse the HTML content
soup = BeautifulSoup(response.content, 'html.parser')

# Find and extract the news article titles and links
articles = soup.find_all('article', class_='gs-c-promo')
for article in articles[:10]:
    title = article.find('h3', class_='gs-c-promo-heading__title').text.strip()
    link = article.find('a')['href']
    print(f"Title: {title}")
    print(f"Link: {link}")
    print()

