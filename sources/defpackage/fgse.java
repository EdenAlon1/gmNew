package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgse extends Exception {
    public fgse(String str) {
        super(str);
    }

    public fgse(Exception exc) {
        super("Unable to execute badge", exc);
    }
}
