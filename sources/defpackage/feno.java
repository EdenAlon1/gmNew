package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feno extends fdzj {
    private final Map a;

    public feno(Map map) {
        this.a = map;
    }

    @Override // defpackage.fdzj
    public final fecz a(String str) {
        return (fecz) this.a.get(str);
    }
}
