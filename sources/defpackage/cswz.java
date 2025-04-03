package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cswz extends csxo {
    private final String a;
    private final String b;
    private final Integer c;
    private final List d;

    public cswz(String str, String str2, Integer num, List list) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = list;
    }

    @Override // defpackage.csxo
    public final Integer a() {
        return this.c;
    }

    @Override // defpackage.csxo
    public final String b() {
        return this.b;
    }

    @Override // defpackage.csxo
    public final String c() {
        return this.a;
    }

    @Override // defpackage.csxo
    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof csxo) {
            csxo csxoVar = (csxo) obj;
            String str = this.a;
            if (str != null ? str.equals(csxoVar.c()) : csxoVar.c() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(csxoVar.b()) : csxoVar.b() == null) {
                    Integer num = this.c;
                    if (num != null ? num.equals(csxoVar.a()) : csxoVar.a() == null) {
                        List list = this.d;
                        if (list != null ? list.equals(csxoVar.d()) : csxoVar.d() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode ^ 1000003;
        Integer num = this.c;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003;
        List list = this.d;
        return hashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TenorMedia{url=" + this.a + ", preview=" + this.b + ", size=" + this.c + ", dims=" + String.valueOf(this.d) + "}";
    }
}
