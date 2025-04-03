package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class crb implements ffxy {
    final /* synthetic */ dbe a;
    final /* synthetic */ hkx b;
    final /* synthetic */ hij c;

    public crb(hij hijVar, dbe dbeVar, hkx hkxVar) {
        this.c = hijVar;
        this.a = dbeVar;
        this.b = hkxVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        boolean z;
        if (((Boolean) obj).booleanValue()) {
            ffjm ffjmVar = (ffjm) this.b.a();
            dbe dbeVar = this.a;
            z = ((Boolean) ffjmVar.a(dbeVar.e(), dbeVar.f())).booleanValue();
        } else {
            z = false;
        }
        this.c.b(Boolean.valueOf(z));
        return ffcu.a;
    }
}
