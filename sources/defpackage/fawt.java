package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fawt implements faws {
    private final favq a;

    public fawt(favq favqVar) {
        this.a = favqVar;
    }

    @Override // defpackage.faws
    public final fawj a(String str, favp favpVar, fawp fawpVar) {
        return new fawh(str, "PUT", null, favpVar, null, this.a, fawpVar, true);
    }

    @Override // defpackage.faws
    public final fawj b(String str, favs favsVar, favp favpVar, String str2, fawp fawpVar) {
        boolean z = true;
        if (!emuz.e("POST", "put") && !emuz.e("POST", "post")) {
            z = false;
        }
        emxf.a(z);
        return (favpVar.e() == -1 || favpVar.e() >= fawpVar.b) ? new fawh(str, "POST", favsVar, favpVar, str2, this.a, fawpVar, false) : new fawd(str, favsVar, favpVar, str2, this.a, fawpVar);
    }
}
