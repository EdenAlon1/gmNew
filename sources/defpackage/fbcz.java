package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbcz {
    public static final /* synthetic */ fcdx a(fcdv fcdvVar) {
        eyfy build = fcdvVar.build();
        build.getClass();
        return (fcdx) build;
    }

    public static final void b(fcdz fcdzVar, fcdv fcdvVar) {
        fcdvVar.copyOnWrite();
        fcdx fcdxVar = (fcdx) fcdvVar.instance;
        fcdx fcdxVar2 = fcdx.a;
        fcdxVar.c = fcdzVar;
        fcdxVar.b |= 1;
    }

    public static final void c(fcdz fcdzVar, fcdv fcdvVar) {
        fcdvVar.copyOnWrite();
        fcdx fcdxVar = (fcdx) fcdvVar.instance;
        fcdx fcdxVar2 = fcdx.a;
        fcdxVar.d = fcdzVar;
        fcdxVar.b |= 2;
    }

    public static final void d(int i, fcdv fcdvVar) {
        fcdvVar.copyOnWrite();
        fcdx fcdxVar = (fcdx) fcdvVar.instance;
        fcdx fcdxVar2 = fcdx.a;
        fcdxVar.e = fcdw.a(i);
    }
}
