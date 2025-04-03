package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cxqi extends crhx {
    private static final enru f = enru.c("com/google/android/apps/messaging/ui/common/CursorRecyclerAdapter");
    protected final Context e;

    public cxqi(Context context, ekyo ekyoVar) {
        super(ekyoVar);
        this.e = context;
    }

    public abstract wr F(Context context, ViewGroup viewGroup);

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        return F(this.e, viewGroup);
    }

    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        int i2 = engw.d;
        z(wrVar, i, enou.a);
    }

    public abstract void m(wr wrVar, Cursor cursor);

    @Override // defpackage.vk
    public final void z(wr wrVar, int i, List list) {
        bfkf bfkfVar;
        if (!this.a || (bfkfVar = this.d) == null) {
            ensk j = f.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/ui/common/CursorRecyclerAdapter", "onBindViewHolder", 57, "CursorRecyclerAdapter.java")).q("Cursor is not available when binding the view");
        } else {
            if (!bfkfVar.moveToPosition(i)) {
                throw new IllegalStateException(a.h(i, "couldn't move cursor to position "));
            }
            m(wrVar, this.d.a());
        }
    }
}
