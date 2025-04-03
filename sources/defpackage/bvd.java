package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bvd {
    public abstract bve a();

    public final bve b() {
        bve a = a();
        bwe bweVar = (bwe) a;
        int i = bweVar.b;
        int i2 = bweVar.c;
        String str = i == -1 ? " audioSource" : "";
        if (i2 <= 0) {
            str = str.concat(" sampleRate");
        }
        if (bweVar.d <= 0) {
            str = str.concat(" channelCount");
        }
        if (bweVar.e == -1) {
            str = str.concat(" audioFormat");
        }
        if (str.isEmpty()) {
            return a;
        }
        throw new IllegalArgumentException("Required settings missing or non-positive:".concat(str));
    }

    public abstract void c(int i);

    public abstract void d(int i);

    public abstract void e(int i);

    public abstract void f(int i);
}
