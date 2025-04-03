package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acee {
    public static final cskc a = cskc.f("BugleDiagnostics", acee.class);
    public final Context b;
    public List c;
    public final ffbr d;
    public final acfk e;
    public final ServiceConnection f = new acec(this);
    public boolean g;
    public aced h;
    private final acef i;

    public acee(Context context, acef acefVar, ffbr ffbrVar, acfk acfkVar) {
        this.b = context;
        this.i = acefVar;
        this.d = ffbrVar;
        this.e = acfkVar;
    }

    public final List a() {
        if (this.c == null) {
            acef acefVar = this.i;
            ArrayList arrayList = new ArrayList();
            acea aceaVar = acefVar.e;
            arrayList.add(new acfr(acefVar.a, new acfq(aceaVar.b.d(), ((cfus) aceaVar.a.b()).a())));
            arrayList.add(acefVar.c);
            arrayList.add(acefVar.b);
            arrayList.add(acefVar.d);
            this.c = arrayList;
        }
        return this.c;
    }
}
