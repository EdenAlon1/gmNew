package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edrg extends edsi {
    public dhqd a;
    public String b;
    public byte c;
    private List d;
    private List e;

    @Override // defpackage.edsi
    public final edsj a() {
        List list;
        List list2;
        String str;
        if (this.c == 7 && (list = this.d) != null && (list2 = this.e) != null && (str = this.b) != null) {
            return new edrh(this.a, list, list2, str);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" openNow");
        }
        if (this.d == null) {
            sb.append(" placeFields");
        }
        if (this.e == null) {
            sb.append(" priceLevels");
        }
        if ((this.c & 2) == 0) {
            sb.append(" strictTypeFiltering");
        }
        if (this.b == null) {
            sb.append(" textQuery");
        }
        if ((this.c & 4) == 0) {
            sb.append(" routingSummariesIncluded");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.edsi
    public final List b() {
        List list = this.d;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"placeFields\" has not been set");
    }

    @Override // defpackage.edsi
    public final List c() {
        List list = this.e;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"priceLevels\" has not been set");
    }

    @Override // defpackage.edsi
    public final void d(List list) {
        if (list == null) {
            throw new NullPointerException("Null placeFields");
        }
        this.d = list;
    }

    @Override // defpackage.edsi
    public final void e(List list) {
        if (list == null) {
            throw new NullPointerException("Null priceLevels");
        }
        this.e = list;
    }
}
