package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffsh extends ffgo implements ffvh {
    public static final ffsg a = new ffsg();
    public final long b;

    public ffsh(long j) {
        super(a);
        this.b = j;
    }

    @Override // defpackage.ffvh
    public final /* bridge */ /* synthetic */ Object a(ffhd ffhdVar) {
        ffsj ffsjVar = (ffsj) ffhdVar.get(ffsj.a);
        String str = ffsjVar != null ? ffsjVar.b : "coroutine";
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int Y = ffpc.Y(name, " @");
        if (Y < 0) {
            Y = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + Y + 10);
        String substring = name.substring(0, Y);
        substring.getClass();
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.b);
        currentThread.setName(sb.toString());
        return name;
    }

    @Override // defpackage.ffvh
    public final /* bridge */ /* synthetic */ void b(ffhd ffhdVar, Object obj) {
        Thread.currentThread().setName((String) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffsh) && this.b == ((ffsh) obj).b;
    }

    public final int hashCode() {
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "CoroutineId(" + this.b + ")";
    }
}
