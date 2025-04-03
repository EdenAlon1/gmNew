package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dclr extends dbzy {
    public final AttachmentQueueState A;
    private final dbzu f;

    protected dclr(dcak dcakVar, AttachmentQueueState attachmentQueueState, dcab dcabVar, ContentGridView contentGridView, int i) {
        super(dcakVar, dcabVar, contentGridView, i);
        dbzu dbzuVar = new dbzu() { // from class: dclq
            @Override // defpackage.dbzu
            public final void e(AttachmentQueueState attachmentQueueState2) {
                List<View> B;
                int g;
                boolean o;
                TextView textView;
                ufd ufdVar;
                dcau dcauVar = dclr.this.d;
                if (dcauVar == null || (B = dcauVar.B()) == null) {
                    return;
                }
                for (View view : B) {
                    if (view instanceof SelectableContentItemView) {
                        final SelectableContentItemView selectableContentItemView = (SelectableContentItemView) view;
                        if (!((Boolean) cful.o.e()).booleanValue() || (ufdVar = selectableContentItemView.h) == null) {
                            g = attachmentQueueState2.g(selectableContentItemView.g);
                            o = attachmentQueueState2.o(selectableContentItemView.g);
                        } else {
                            g = attachmentQueueState2.f(ufdVar);
                            o = attachmentQueueState2.n(selectableContentItemView.h);
                        }
                        selectableContentItemView.l = g;
                        if (g != -1 && (textView = selectableContentItemView.e) != null) {
                            textView.setText(Integer.toString(g + 1));
                        }
                        if (selectableContentItemView.k != o) {
                            selectableContentItemView.k = o;
                            TextView textView2 = selectableContentItemView.e;
                            if (textView2 != null && selectableContentItemView.f != null) {
                                textView2.clearAnimation();
                                if (selectableContentItemView.k) {
                                    selectableContentItemView.d.n(selectableContentItemView, 0.88f);
                                    selectableContentItemView.d.k(selectableContentItemView.e, 0, null);
                                    selectableContentItemView.d.h(selectableContentItemView.f, selectableContentItemView.i, selectableContentItemView.j);
                                } else {
                                    selectableContentItemView.d.n(selectableContentItemView, 1.0f);
                                    selectableContentItemView.d.k(selectableContentItemView.e, 8, new Runnable() { // from class: dcls
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            SelectableContentItemView selectableContentItemView2 = SelectableContentItemView.this;
                                            if (selectableContentItemView2.k) {
                                                selectableContentItemView2.d.k(selectableContentItemView2.e, 0, null);
                                            }
                                        }
                                    });
                                    selectableContentItemView.d.h(selectableContentItemView.f, selectableContentItemView.j, selectableContentItemView.i);
                                }
                            }
                        }
                    }
                }
            }

            @Override // defpackage.dbzu
            public final /* synthetic */ void j() {
            }
        };
        this.f = dbzuVar;
        this.A = attachmentQueueState;
        attachmentQueueState.j(dbzuVar);
    }

    protected abstract epts i();

    protected abstract eptu j();

    public final void v(ufd ufdVar, boolean z, int i) {
        dbzn dbznVar;
        if (!z) {
            AttachmentQueueState attachmentQueueState = this.A;
            attachmentQueueState.getClass();
            if (!attachmentQueueState.p(ufdVar) || (dbznVar = this.a) == null) {
                return;
            }
            dbznVar.g(ufdVar, dcle.b(i(), j()), i);
            return;
        }
        AttachmentQueueState attachmentQueueState2 = this.A;
        attachmentQueueState2.getClass();
        attachmentQueueState2.s(ufdVar);
        dbzn dbznVar2 = this.a;
        if (dbznVar2 != null) {
            dbznVar2.c(ufdVar, dcle.b(i(), j()), false, i);
        }
    }

    @Deprecated
    public final void w(MediaContentItem mediaContentItem, boolean z, int i) {
        dbzn dbznVar;
        if (!z) {
            AttachmentQueueState attachmentQueueState = this.A;
            attachmentQueueState.getClass();
            if (!attachmentQueueState.q(mediaContentItem) || (dbznVar = this.a) == null) {
                return;
            }
            dbznVar.h(mediaContentItem, dcle.b(i(), j()), i);
            return;
        }
        AttachmentQueueState attachmentQueueState2 = this.A;
        attachmentQueueState2.getClass();
        attachmentQueueState2.r(mediaContentItem);
        dbzn dbznVar2 = this.a;
        if (dbznVar2 != null) {
            dbznVar2.d(mediaContentItem, dcle.b(i(), j()), false, i);
        }
    }
}
