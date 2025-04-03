package defpackage;

import java.text.MessageFormat;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgui extends Exception {
    private static final long serialVersionUID = 6116644246112002214L;

    public fgui(String str, int i) {
        super(String.valueOf(MessageFormat.format("Error at line {0}:", Integer.valueOf(i))).concat(String.valueOf(str)));
    }

    public fgui(String str, int i, Throwable th) {
        super(String.valueOf(MessageFormat.format("Error at line {0}:", Integer.valueOf(i))).concat(String.valueOf(str)), th);
    }
}
