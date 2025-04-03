package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbzu extends eyfq implements eyht {
    public fbzu() {
        super(fbzv.a);
    }

    public final void a(eyee eyeeVar) {
        copyOnWrite();
        fbzv fbzvVar = (fbzv) this.instance;
        fbzv fbzvVar2 = fbzv.a;
        eyeeVar.getClass();
        eygr eygrVar = fbzvVar.d;
        if (!eygrVar.c()) {
            fbzvVar.d = eyfy.mutableCopy(eygrVar);
        }
        fbzvVar.d.add(eyeeVar);
    }
}
