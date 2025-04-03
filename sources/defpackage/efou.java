package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efou {
    private final long a = System.nanoTime();

    public final eyev a() {
        long nanoTime = System.nanoTime() - this.a;
        eyeu eyeuVar = (eyeu) eyev.a.createBuilder();
        eyeuVar.copyOnWrite();
        ((eyev) eyeuVar.instance).b = nanoTime / 1000000000;
        eyeuVar.copyOnWrite();
        ((eyev) eyeuVar.instance).c = (int) (nanoTime % 1000000000);
        return (eyev) eyeuVar.build();
    }

    public final eyja b() {
        eyiz eyizVar = (eyiz) eyja.a.createBuilder();
        eyizVar.copyOnWrite();
        eyja eyjaVar = (eyja) eyizVar.instance;
        long j = this.a;
        eyjaVar.b = j / 1000000000;
        eyizVar.copyOnWrite();
        ((eyja) eyizVar.instance).c = (int) (j % 1000000000);
        return (eyja) eyizVar.build();
    }
}
