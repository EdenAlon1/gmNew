package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ydt {
    public static final /* synthetic */ yds a(ydr ydrVar) {
        eyfy build = ydrVar.build();
        build.getClass();
        return (yds) build;
    }

    public static final void b(String str, ydr ydrVar) {
        ydrVar.copyOnWrite();
        yds ydsVar = (yds) ydrVar.instance;
        yds ydsVar2 = yds.a;
        ydsVar.b |= 2;
        ydsVar.d = str;
    }

    public static final void c(doza dozaVar, ydr ydrVar) {
        ydrVar.copyOnWrite();
        yds ydsVar = (yds) ydrVar.instance;
        yds ydsVar2 = yds.a;
        ydsVar.c = dozaVar;
        ydsVar.b |= 1;
    }
}
