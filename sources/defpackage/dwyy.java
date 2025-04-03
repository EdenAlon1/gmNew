package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwyy extends dwzz {
    public String a;
    public String b;

    @Override // defpackage.dwzz
    public final dxaa a() {
        String str = this.a;
        if (str != null) {
            return new dwzb(str, this.b);
        }
        throw new IllegalStateException("Missing required properties: action");
    }
}
