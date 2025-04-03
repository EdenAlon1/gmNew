package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dhtr implements dhsg {
    protected final void b(dhsh dhshVar) {
        if (dhshVar.a != this) {
            throw new IllegalArgumentException(String.format("Ticks (%s) must be from this Ticker (%s)", dhshVar, this));
        }
    }
}
