package defpackage;

import android.content.Context;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbca extends cbbl {
    public static final entd b = entd.c("BugleImage");
    public static final int c = (int) TimeUnit.SECONDS.toMillis(5);
    public final cbcb d;
    public final cqoh e;
    public final crmr f;

    /* compiled from: PG */
    public interface a {
        crmr iz();

        cqoh v();
    }

    public cbca(int i, String str, Context context) {
        super(i, str);
        this.d = new cbcb(this);
        a aVar = (a) ekhw.a(context, a.class);
        this.f = aVar.iz();
        this.e = aVar.v();
    }

    @Override // defpackage.cbbl
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final synchronized cbbk a(String str, cbbk cbbkVar) {
        if (cbcb.e(cbbkVar) != 0) {
            cbcb cbcbVar = this.d;
            synchronized (cbcbVar.b) {
                int e = cbcb.e(cbbkVar);
                csix.k(e != 0);
                LinkedList linkedList = (LinkedList) cbcbVar.a.get(e);
                if (linkedList == null) {
                    linkedList = new LinkedList();
                    cbcbVar.a.put(e, linkedList);
                }
                linkedList.addLast(cbbkVar);
            }
        }
        return (cbbk) super.a(str, cbbkVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cbbl, android.util.LruCache
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final synchronized void entryRemoved(boolean z, String str, cbbk cbbkVar, cbbk cbbkVar2) {
        if (cbcb.e(cbbkVar) != 0) {
            cbcb cbcbVar = this.d;
            synchronized (cbcbVar.b) {
                int e = cbcb.e(cbbkVar);
                csix.k(e != 0);
                LinkedList linkedList = (LinkedList) cbcbVar.a.get(e);
                if (linkedList != null) {
                    linkedList.remove(cbbkVar);
                }
            }
        }
        super.entryRemoved(z, str, cbbkVar, cbbkVar2);
    }

    public cbca(String str, Context context) {
        this(5120, str, context);
    }
}
