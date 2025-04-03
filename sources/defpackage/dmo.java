package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmo {
    public final ffix a;
    public final ffrf b;

    public dmo(ffix ffixVar, ffrf ffrfVar) {
        this.a = ffixVar;
        this.b = ffrfVar;
    }

    public final String toString() {
        String str;
        ffsj ffsjVar = (ffsj) ((ffrh) this.b).b.get(ffsj.a);
        String str2 = ffsjVar != null ? ffsjVar.b : null;
        StringBuilder sb = new StringBuilder("Request@");
        String num = Integer.toString(hashCode(), 16);
        num.getClass();
        sb.append(num);
        if (str2 != null) {
            str = "[" + str2 + "](";
        } else {
            str = "(";
        }
        sb.append(str);
        sb.append("currentBounds()=");
        sb.append(this.a.invoke());
        sb.append(", continuation=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
