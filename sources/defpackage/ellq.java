package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ellq {
    public final elbx a;
    public View b;

    public ellq(elbx elbxVar) {
        this.a = elbxVar;
    }

    public static final String d(String str, View view) {
        String str2 = (String) view.getTag(R.id.tiktok_event_internal_trace);
        if (str2 == null) {
            str2 = view.getClass().getSimpleName();
        }
        return a.w(str2, str, " ");
    }

    public static final void e(View view, String str) {
        view.setTag(R.id.tiktok_event_internal_trace, str);
    }

    @Deprecated
    public final void a(View view, final View.OnClickListener onClickListener) {
        final emwl emwlVar = new emwl() { // from class: ellk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return elad.a;
            }
        };
        view.setOnClickListener(new View.OnClickListener() { // from class: ellp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                View.OnClickListener onClickListener2 = onClickListener;
                if (ekys.a(view2)) {
                    emwl emwlVar2 = emwlVar;
                    ellq ellqVar = ellq.this;
                    ekzm c = ellqVar.a.c(ellq.d("Clicked", view2), (elae) emwlVar2.apply(view2));
                    try {
                        onClickListener2.onClick(view2);
                        c.close();
                    } catch (Throwable th) {
                        try {
                            c.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
        });
    }

    public final void b(View view, final ellf ellfVar) {
        a(view, new View.OnClickListener() { // from class: ellm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ellj.g(ellf.this, view2);
            }
        });
    }

    public final void c(View view, final emyl emylVar) {
        a(view, new View.OnClickListener() { // from class: elln
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ellj.g((ellf) emyl.this.get(), view2);
            }
        });
    }
}
