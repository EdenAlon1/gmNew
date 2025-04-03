package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgle extends Exception {
    public dgle(String str) {
        super(String.format("Protocol version %s not supported", str));
    }
}
