package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcqp implements Comparable {
    public final aoku a;
    public final int b;
    public final String c;

    public bcqp(aolr aolrVar, String str, int i, String str2) {
        this.b = i;
        this.c = str2;
        this.a = aolrVar.n(str);
    }

    public final String a() {
        return cuxh.b(emxe.b(this.a.G().a));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bcqp bcqpVar = (bcqp) obj;
        int i = bcqpVar.b;
        int i2 = this.b;
        if (i2 == i) {
            boolean booleanValue = ((Boolean) aolr.a.e()).booleanValue();
            return emxe.b(this.a.p(booleanValue)).compareTo(emxe.b(bcqpVar.a.p(booleanValue)));
        }
        if (i2 == 2) {
            return -1;
        }
        if (i == 2) {
            return 1;
        }
        return Integer.compare(i2, i);
    }
}
