package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class euna extends Exception {
    @Deprecated
    protected euna() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public euna(String str) {
        super(str);
        dfwv.m(str, "Detail message must not be empty");
    }
}
