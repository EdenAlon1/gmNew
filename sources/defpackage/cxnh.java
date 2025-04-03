package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxnh implements mw {
    final /* synthetic */ cxno a;
    final /* synthetic */ cxnk b;

    public cxnh(cxnk cxnkVar, cxno cxnoVar) {
        this.a = cxnoVar;
        this.b = cxnkVar;
    }

    @Override // defpackage.mw
    public final void a(int i, int i2, Object obj) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (i3 == ((cxnq) this.a).c) {
                View childAt = this.b.b.getChildAt(i3);
                childAt.getClass();
                ((aepp) childAt).H().a(((cxnq) this.a).b);
            } else {
                cxoc cxocVar = (cxoc) this.b.b.getChildAt(i3);
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) ((cxnq) this.a).a.get(Integer.valueOf(i3));
                messagePartCoreData.getClass();
                cxocVar.a(messagePartCoreData);
                cxocVar.b();
            }
        }
    }

    @Override // defpackage.mw
    public final void b(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (i3 == ((cxnq) this.a).c) {
                Context context = this.b.t;
                context.getClass();
                aepr H = new aepp(context).H();
                this.b.c(H.a);
                cxnk cxnkVar = this.b;
                cxnkVar.b.addView(H.a);
                H.a(((cxnq) this.a).b);
            } else {
                cxnk cxnkVar2 = this.b;
                cxoc cxocVar = new cxoc(cxnkVar2.t, cxnkVar2, cxnkVar2, (crih) cxnkVar2.x.b(), (elbx) this.b.y.b());
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) ((cxnq) this.a).a.get(Integer.valueOf(i3));
                messagePartCoreData.getClass();
                this.b.c(cxocVar);
                this.b.b.addView(cxocVar);
                cxocVar.a(messagePartCoreData);
                cxocVar.b();
            }
        }
    }

    @Override // defpackage.mw
    public final void c(int i, int i2) {
        LinearLayout linearLayout = this.b.b;
        View childAt = linearLayout.getChildAt(i);
        linearLayout.removeViewsInLayout(i, 1);
        this.b.b.addView(childAt, i2);
    }

    @Override // defpackage.mw
    public final void d(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            cxnk cxnkVar = this.b;
            cxnkVar.d(cxnkVar.b.getChildAt(i3));
        }
    }
}
