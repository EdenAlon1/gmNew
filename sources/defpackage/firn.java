package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class firn implements Serializable {
    public static final firn a = new firm("eras", (byte) 1);
    public static final firn b = new firm("centuries", (byte) 2);
    public static final firn c = new firm("weekyears", (byte) 3);
    public static final firn d = new firm("years", (byte) 4);
    public static final firn e = new firm("months", (byte) 5);
    public static final firn f = new firm("weeks", (byte) 6);
    public static final firn g = new firm("days", (byte) 7);
    public static final firn h = new firm("halfdays", (byte) 8);
    public static final firn i = new firm("hours", (byte) 9);
    public static final firn j = new firm("minutes", (byte) 10);
    public static final firn k = new firm("seconds", (byte) 11);
    public static final firn l = new firm("millis", (byte) 12);
    private static final long serialVersionUID = 8765135187319L;
    public final String m;

    protected firn(String str) {
        this.m = str;
    }

    public abstract firl a(firb firbVar);

    public final String toString() {
        return this.m;
    }
}
