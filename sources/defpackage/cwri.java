package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwri {
    private final cwrf a;

    public cwri(cwrf cwrfVar) {
        this.a = cwrfVar;
    }

    public final /* synthetic */ cwrg a() {
        eyfy build = this.a.build();
        build.getClass();
        return (cwrg) build;
    }

    public final void b(boolean z) {
        cwrf cwrfVar = this.a;
        cwrfVar.copyOnWrite();
        cwrg cwrgVar = (cwrg) cwrfVar.instance;
        cwrg cwrgVar2 = cwrg.a;
        cwrgVar.b |= 1;
        cwrgVar.c = z;
    }
}
