package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adl extends adg {
    final /* synthetic */ adn a;
    final /* synthetic */ String b;
    final /* synthetic */ adu c;

    public adl(adn adnVar, String str, adu aduVar) {
        this.a = adnVar;
        this.b = str;
        this.c = aduVar;
    }

    @Override // defpackage.adg
    public final void a(Object obj, kli kliVar) {
        Object obj2 = this.a.c.get(this.b);
        if (obj2 == null) {
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.c + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
        int intValue = ((Number) obj2).intValue();
        this.a.d.add(this.b);
        try {
            this.a.a(intValue, this.c, obj, kliVar);
        } catch (Exception e) {
            this.a.d.remove(this.b);
            throw e;
        }
    }

    @Override // defpackage.adg
    public final void b() {
        this.a.e(this.b);
    }
}
