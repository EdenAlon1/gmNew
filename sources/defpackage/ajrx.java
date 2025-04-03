package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajrx {
    public static final /* synthetic */ ajrw a(ajrv ajrvVar) {
        eyfy build = ajrvVar.build();
        build.getClass();
        return (ajrw) build;
    }

    public static final void b(String str, ajrv ajrvVar) {
        str.getClass();
        ajrvVar.copyOnWrite();
        ajrw ajrwVar = (ajrw) ajrvVar.instance;
        ajrw ajrwVar2 = ajrw.a;
        ajrwVar.b = 1;
        ajrwVar.c = str;
    }

    public static final void c(int i, ajrv ajrvVar) {
        ajrvVar.copyOnWrite();
        ajrw ajrwVar = (ajrw) ajrvVar.instance;
        ajrw ajrwVar2 = ajrw.a;
        ajrwVar.c = Integer.valueOf(i - 2);
        ajrwVar.b = 2;
    }
}
