package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euzn extends evab {
    public String a;
    public evae b;

    @Override // defpackage.evab
    public final evaf a() {
        String str = this.a;
        if (str != null) {
            return new euzo(str, this.b);
        }
        throw new IllegalStateException("Missing required properties: service");
    }
}
