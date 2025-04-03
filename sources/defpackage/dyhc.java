package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyhc extends mj implements dzxl {
    public final dzxm d;
    public final Map e;
    public final SparseArray f;
    private final dzxj g;

    public dyhc(dzxm dzxmVar, Context context) {
        super(new dyha());
        this.d = dzxmVar;
        this.e = new HashMap();
        this.f = new SparseArray();
        this.g = new dyhb(new View(context));
        ((dyhd) dzxmVar).e.am(this);
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        String a = ((dzxk) b(i)).a();
        if (this.e.get(a) != null) {
            return ((Integer) this.e.get(a)).intValue();
        }
        throw new IllegalStateException("getItemViewType - AttachmentPreviewsInterface not provided to handle attachment type: ".concat(String.valueOf(a)));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        dzxn dzxnVar = (dzxn) this.f.get(i);
        return dzxnVar == null ? this.g : dzxnVar.a();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        ((dzxj) wrVar).C();
    }
}
