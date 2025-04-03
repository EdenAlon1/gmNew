package com.google.android.libraries.messaging.lighter.ui.messagecell;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableString;
import android.text.format.DateUtils;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.dyhj;
import defpackage.dzhs;
import defpackage.dzqm;
import defpackage.dzyd;
import defpackage.dzye;
import defpackage.eabs;
import defpackage.eabu;
import defpackage.ehdr;
import defpackage.emux;
import defpackage.emxc;
import defpackage.fdql;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class MessageCellStatusView extends AppCompatTextView {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    int b;
    public emxc c;
    public long e;
    public dzqm f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final int m;
    private final Runnable n;

    public MessageCellStatusView(Context context) {
        this(context, null);
    }

    private final SpannableString c(String str, String str2) {
        SpannableString spannableString = new SpannableString(getResources().getString(R.string.bullet_point_separated_text, str, str2));
        spannableString.setSpan(new StyleSpan(1), str.length() + 1, str.length() + 2, 256);
        return spannableString;
    }

    public final void a(boolean z) {
        setVisibility(true != z ? 8 : 0);
    }

    public final void b(String str) {
        CharSequence formatDateTime;
        if (this.f != null) {
            setTextAppearance(this.b);
            Context context = getContext();
            long j = this.e;
            dyhj.a();
            long abs = Math.abs(System.currentTimeMillis() - j);
            if (abs < 60000) {
                formatDateTime = context.getResources().getText(R.string.recent_message_timestamp_text);
            } else if (abs < 3600000) {
                long j2 = abs / 60000;
                formatDateTime = String.format(context.getResources().getQuantityString(R.plurals.lt_num_minutes_ago, (int) j2), Long.valueOf(j2));
            } else {
                formatDateTime = dzye.a(j) ? DateUtils.formatDateTime(context, j, 1) : abs < 604800000 ? DateUtils.formatDateTime(context, j, 32771) : abs < 31449600000L ? DateUtils.formatDateTime(context, j, 65560) : DateUtils.formatDateTime(context, j, 65556);
            }
            dzqm dzqmVar = dzqm.INVALID;
            switch (this.f.ordinal()) {
                case 1:
                case 2:
                case 3:
                    setText(formatDateTime);
                    break;
                case 4:
                default:
                    a(false);
                    break;
                case 5:
                    setText("");
                    break;
                case 6:
                    setText(c(this.i, this.k));
                    setTextColor(this.m);
                    break;
                case 7:
                    setText(c(formatDateTime.toString(), this.g));
                    if (str != null) {
                        dzhs.a().c("MessagePerceivedSentLatency", str);
                        break;
                    }
                    break;
                case 8:
                    setText(c(formatDateTime.toString(), this.h));
                    if (str != null) {
                        dzhs.a().c("MessagePerceivedDeliveredLatency", str);
                        break;
                    }
                    break;
                case 9:
                    setText(c(formatDateTime.toString(), this.j));
                    break;
                case 10:
                    setText(this.l);
                    setTextColor(this.m);
                    break;
            }
        }
    }

    public MessageCellStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bubbleCellStyle);
    }

    public MessageCellStatusView(Context context, AttributeSet attributeSet, int i) {
        super(dzyd.a(context, fdql.i()), attributeSet, i);
        this.c = emux.a;
        eabs eabsVar = new eabs(this);
        this.n = eabsVar;
        setPadding(getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_status_start_end_padding), getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_top_padding), getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_status_start_end_padding), getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_status_bottom_padding));
        this.g = getContext().getText(R.string.message_sent_success).toString();
        this.i = getContext().getText(R.string.message_sent_failed).toString();
        this.h = getContext().getText(R.string.message_sent_delivered).toString();
        this.j = getContext().getText(R.string.message_sent_read).toString();
        this.k = getContext().getText(R.string.lighter_tap_item_to_retry).toString();
        this.l = getContext().getText(R.string.message_delivery_failed).toString();
        this.m = ehdr.b(this, R.attr.colorError);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, eabu.c, i, R.style.LighterBubbleCellStatus);
        this.b = obtainStyledAttributes.getResourceId(0, R.style.LabelText);
        obtainStyledAttributes.recycle();
        postDelayed(eabsVar, a);
    }
}
