import { GestionHorairesPage } from './app.po';

describe('gestion-horaires App', function() {
  let page: GestionHorairesPage;

  beforeEach(() => {
    page = new GestionHorairesPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
