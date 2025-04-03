package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ura extends upz implements vyy {
    public final Context a;
    public mz d;
    public uwh f;
    public String g;
    public boolean h;
    public final vyw i;
    public Set j;
    public Map k;
    public final uwi l;
    private final ekyo m;
    private final uwp n;

    public ura(cqoh cqohVar, vyw vywVar, ekyo ekyoVar, uwi uwiVar, Context context, czic czicVar, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, uwp uwpVar) {
        super(czicVar, onClickListener, onLongClickListener, cqohVar);
        this.h = true;
        this.k = enoz.a;
        this.i = vywVar;
        this.l = uwiVar;
        this.a = context;
        this.m = ekyoVar;
        this.n = uwpVar;
    }

    private final void N(bcse bcseVar) {
        mz mzVar = this.d;
        mzVar.getClass();
        q(mzVar.d(bcseVar));
    }

    public final int F(MessageIdType messageIdType) {
        uwh uwhVar = this.f;
        if (uwhVar == null) {
            return -1;
        }
        csix.g();
        bcse bcseVar = (bcse) uwhVar.h.get(messageIdType);
        if (bcseVar != null) {
            return uwhVar.f.d(bcseVar);
        }
        return -1;
    }

    public final elfl I(MessageIdType messageIdType) {
        uwh uwhVar = this.f;
        uwhVar.getClass();
        return elfl.g(uwhVar.j(messageIdType));
    }

    @Override // defpackage.vyy
    public final void J(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            N((bcse) it.next());
        }
    }

    @Override // defpackage.vyy
    public final void K(bcse bcseVar) {
        N(bcseVar);
    }

    @Override // defpackage.vk
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void g(uqe uqeVar, int i) {
        elav a = this.m.a("MessageListAdapter onBindViewHolder");
        try {
            czkr czkrVar = (czkr) uqeVar.s;
            mz mzVar = this.d;
            mzVar.getClass();
            bcse bcseVar = (bcse) mzVar.e(i);
            Set set = this.j;
            String str = null;
            if (set != null && set.contains(bcseVar.u())) {
                str = this.g;
            }
            bcse bcseVar2 = (bcse) this.d.e(i);
            Long l = (Long) this.k.get(bcseVar.u());
            bcseVar2.j = l == null ? 0L : l.longValue();
            if (czkrVar instanceof czid) {
                ((czid) czkrVar).d((bcse) this.d.e(i), str, this.h, i == 0);
            }
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vyy
    public final void M(bcse bcseVar) {
        if (this.i.a() == 1) {
            N(bcseVar);
        } else {
            if (this.i.a() != 2) {
                N(bcseVar);
                return;
            }
            Iterator it = this.i.b().iterator();
            while (it.hasNext()) {
                N((bcse) it.next());
            }
        }
    }

    @Override // defpackage.vk
    public final int a() {
        mz mzVar = this.d;
        mzVar.getClass();
        return mzVar.g;
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        mz mzVar = this.d;
        mzVar.getClass();
        bcse bcseVar = (bcse) mzVar.e(i);
        if (!bcseVar.w().k()) {
            return bcseVar.u().a;
        }
        Long l = bcseVar.A;
        if (l != null) {
            return l.longValue();
        }
        final uwp uwpVar = this.n;
        Long l2 = (Long) ConcurrentMap.EL.computeIfAbsent(uwpVar.b, bcseVar.w(), new Function() { // from class: uwo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(uwp.this.a.incrementAndGet());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        long longValue = l2.longValue();
        bcseVar.A = l2;
        return longValue;
    }

    @Override // defpackage.upz
    protected final int m(int i) {
        mz mzVar = this.d;
        mzVar.getClass();
        bcse bcseVar = (bcse) mzVar.e(i);
        return bcseVar.aZ() ? R.layout.conversation_toolstone : bcseVar.aY() ? R.layout.conversation_tombstone : bcseVar.aO() ? ((Boolean) ((cfup) czpe.a.get()).e()).booleanValue() ? R.layout.conversation_rich_card_view2 : R.layout.conversation_rich_card_view : bcseVar.aP() ? R.layout.conversation_rich_card_carousel_view : R.layout.conversation_message_view;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void z(wr wrVar, int i, List list) {
        uqe uqeVar = (uqe) wrVar;
        elav a = this.m.a("MessageListAdapter onBindViewHolder with payloads");
        try {
            if (list.isEmpty()) {
                g(uqeVar, i);
            } else {
                for (Object obj : list) {
                    czkr czkrVar = (czkr) uqeVar.s;
                    emxf.m(czkrVar instanceof czid, "MessageListAdapter.onBindViewHolder() called with FileTransferProgress payload with a view that isn't a ConversationMessageRowView.");
                    ((czid) czkrVar).e(obj);
                }
            }
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
