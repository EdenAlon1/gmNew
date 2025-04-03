package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class osy {
    public Executor b;
    public oxm c;
    public boolean d;
    public boolean g;
    public ffhd h;
    private final ffmo i;
    private final Context j;
    private final String k;
    private Executor m;
    public final List a = new ArrayList();
    private final List l = new ArrayList();
    private final ota n = new ota();
    public final Set e = new LinkedHashSet();
    private final Set o = new LinkedHashSet();
    private final List p = new ArrayList();
    public boolean f = true;

    public osy(Context context, Class cls, String str) {
        this.i = ffiu.c(cls);
        this.j = context;
        this.k = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0432, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0428 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x042a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.otb a() {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osy.a():otb");
    }

    public final void b(ovj... ovjVarArr) {
        int length;
        int i = 0;
        while (true) {
            length = ovjVarArr.length;
            if (i >= length) {
                break;
            }
            ovj ovjVar = ovjVarArr[0];
            this.o.add(Integer.valueOf(ovjVar.a));
            this.o.add(Integer.valueOf(ovjVar.b));
            i = 1;
        }
        ota otaVar = this.n;
        ovj[] ovjVarArr2 = (ovj[]) Arrays.copyOf(ovjVarArr, length);
        ovjVarArr2.getClass();
        for (ovj ovjVar2 : ovjVarArr2) {
            otaVar.a(ovjVar2);
        }
    }

    public final void c() {
        this.f = true;
        this.g = true;
    }

    public final void d(ffhd ffhdVar) {
        ffhdVar.getClass();
        if (this.m != null || this.b != null) {
            throw new IllegalArgumentException("This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext.");
        }
        if (ffhdVar.get(ffgw.k) == null) {
            throw new IllegalArgumentException("It is required that the coroutine context contain a dispatcher.");
        }
        this.h = ffhdVar;
    }

    public final void e(Executor executor) {
        if (this.h != null) {
            throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
        }
        this.m = executor;
    }
}
