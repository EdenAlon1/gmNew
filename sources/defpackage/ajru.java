package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajru {
    public static final /* synthetic */ ajrt a(ajrs ajrsVar) {
        eyfy build = ajrsVar.build();
        build.getClass();
        return (ajrt) build;
    }

    public static final void b(ajrw ajrwVar, ajrs ajrsVar) {
        ajrsVar.copyOnWrite();
        ajrt ajrtVar = (ajrt) ajrsVar.instance;
        ajrt ajrtVar2 = ajrt.a;
        ajrtVar.d = ajrwVar;
        ajrtVar.b |= 2;
    }

    public static final void c(ajrw ajrwVar, ajrs ajrsVar) {
        ajrwVar.getClass();
        ajrsVar.copyOnWrite();
        ajrt ajrtVar = (ajrt) ajrsVar.instance;
        ajrt ajrtVar2 = ajrt.a;
        ajrtVar.c = ajrwVar;
        ajrtVar.b |= 1;
    }

    public static final void d(ajsj ajsjVar, ajrs ajrsVar) {
        ajrsVar.copyOnWrite();
        ajrt ajrtVar = (ajrt) ajrsVar.instance;
        ajrt ajrtVar2 = ajrt.a;
        ajrtVar.e = ajsjVar;
        ajrtVar.b |= 4;
    }
}
