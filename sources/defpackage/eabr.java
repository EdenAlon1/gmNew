package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.messagecell.MessageCellStatusView;
import com.google.android.libraries.messaging.lighter.ui.messagecell.TimestampHeaderView;
import com.google.android.libraries.messaging.lighter.ui.messagecell.TopLabelView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eabr extends FrameLayout implements eabo {
    public dzqs a;
    public eabx b;
    public final LinearLayout c;
    public final MessageCellStatusView d;
    public final TimestampHeaderView e;
    public final dzxv f;
    public final FrameLayout g;
    public final TopLabelView h;
    public final int i;
    public final int j;
    public final int k;
    private long l;

    public eabr(Context context) {
        super(dzyd.a(context, fdql.i()), null, R.attr.bubbleCellStyle);
        inflate(getContext(), R.layout.bubble_cell_layout, this);
        setPadding(getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_start_end_padding), getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_top_padding), getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_start_end_padding), 0);
        this.c = (LinearLayout) findViewById(R.id.bubble_cell_wrapper);
        this.f = (dzxv) findViewById(R.id.message_avatar);
        this.d = (MessageCellStatusView) findViewById(R.id.bubble_cell_status_view);
        this.e = (TimestampHeaderView) findViewById(R.id.bubble_cell_tombstone_view);
        this.g = (FrameLayout) findViewById(R.id.message_content_wrapper);
        this.h = (TopLabelView) findViewById(R.id.top_label_layout);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, eabu.b, R.attr.bubbleCellStyle, R.style.LighterBubbleCell);
        this.i = obtainStyledAttributes.getResourceId(2, R.style.UndefinedLabelText);
        this.j = obtainStyledAttributes.getResourceId(1, R.style.DefaultLabelText);
        this.k = obtainStyledAttributes.getResourceId(0, R.style.BotLabelText);
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.dzya
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_start_end_padding), 0, getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_start_end_padding), 0);
        view.setId(R.id.message_content);
        Object obj = this.b;
        if (obj != null) {
            this.g.removeView((View) obj);
        }
        this.b = (eabx) view;
        this.g.addView(view, layoutParams);
    }

    @Override // defpackage.dzys
    public final void c() {
        this.d.c = emux.a;
        this.f.c();
        this.b.c();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            dyhj.a();
            this.l = System.currentTimeMillis();
        } else if (action == 1) {
            dyhj.a();
            if (System.currentTimeMillis() - this.l < 200) {
                if (this.a.i().equals(dzqm.OUTGOING_FAILED_SEND)) {
                    performClick();
                    return true;
                }
                if (this.a.h().a() == 2 && !((eabz) this.g.getChildAt(0)).hasSelection()) {
                    performClick();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        super.setAlpha(1.0f);
    }
}
