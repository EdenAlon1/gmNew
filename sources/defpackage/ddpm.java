package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddpm {
    private static final cfup a = cfvl.i(cfvl.b, "disable_logging_search_uma_logger", false);
    private final ffbr b;

    public ddpm(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.b = ffbrVar;
    }

    private final void j(String str, int i) {
        if (((Boolean) a.e()).booleanValue()) {
            return;
        }
        ((akzt) this.b.b()).d(str, i);
    }

    public final void a(String str, int i) {
        if (((Boolean) a.e()).booleanValue()) {
            return;
        }
        ((akzt) this.b.b()).e(str, i);
    }

    public final void b(int i) {
        if (i <= 0 || i > 7) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        a("Bugle.Search.Autocomplete.Suggestion.Clicked", i);
    }

    public final void c(int i) {
        a("Search.ConsentDialog.Cancel.Button.Clicked", i);
    }

    public final void d(int i) {
        a("Search.ConsentDialog.OptIn.Button.Clicked", i);
    }

    public final void e(int i) {
        a("Bugle.Search.Result.Clicked", i);
    }

    public final void f(int i, int i2) {
        switch (i) {
            case 1:
                j("Bugle.Search.Result.Conversation.Count.Displayed", i2);
                break;
            case 2:
                j("Bugle.Search.Result.Images.Count.Displayed", i2);
                break;
            case 3:
                j("Bugle.Search.Result.Videos.Count.Displayed", i2);
                break;
            case 4:
                j("Bugle.Search.Result.Links.Count.Displayed", i2);
                break;
            case 5:
                j("Bugle.Search.Result.Locations.Count.Displayed", i2);
                break;
            case 6:
                j("Bugle.Search.Result.Contacts.Count.Displayed", i2);
                break;
            default:
                j("Bugle.Search.Result.Starred.Text.Count.Displayed", i2);
                break;
        }
    }

    public final void g(int i) {
        a("Bugle.Search.Result.Displayed", i);
    }

    public final void h(int i) {
        a("Bugle.Search.Result.SeeInChat.Clicked", i);
    }

    public final void i(int i) {
        a("Bugle.Search.Result.Open.Clicked", i);
    }
}
