package defpackage;

import java.text.ParseException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkku {
    public boolean a = false;
    private long c = 0;
    public long b = 0;

    public final void a(String str) {
        try {
            this.c = dktd.a(str) / 1000;
        } catch (ParseException unused) {
            this.c = System.currentTimeMillis() / 1000;
        }
    }

    public final String toString() {
        return "Active: " + this.a + ", refresh time " + this.b + ", last active " + this.c;
    }
}
