package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgjj extends Exception {
    public dgjj(int i) {
        super(String.format(Locale.US, "Error code %d is not supported", Integer.valueOf(i)));
    }
}
