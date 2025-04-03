package com.google.android.apps.messaging.ui.conversation.richcard;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard;
import defpackage.azzw;
import defpackage.crjx;
import defpackage.csmj;
import defpackage.czic;
import defpackage.czos;
import defpackage.czpb;
import defpackage.czpd;
import defpackage.czqy;
import defpackage.cztz;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RichCardContentContainer extends czos {
    public TextView a;
    public TextView b;
    public LinearLayout c;
    public czpb d;
    public boolean e;
    public czpd f;
    public crjx g;
    public azzw h;
    public ffbr i;

    public RichCardContentContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected static final int f(TextView textView, int i, int i2) {
        int lineCount = textView.getLineCount();
        while (textView.getVisibility() != 8 && lineCount > 1 && i2 > i) {
            int measuredHeight = textView.getMeasuredHeight();
            lineCount--;
            textView.setMaxLines(lineCount);
            textView.measure(csmj.c(textView), csmj.b(textView));
            i2 -= measuredHeight - textView.getMeasuredHeight();
        }
        return i2;
    }

    final cztz c(czic czicVar) {
        if (this.g.g()) {
            return czqy.m(czicVar);
        }
        if (czicVar == null) {
            return null;
        }
        return czqy.l(czicVar, czicVar.a());
    }

    public final void d(TextView textView, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
            textView.setVisibility(8);
        } else {
            textView.setMaxLines(Alert.DURATION_SHOW_INDEFINITELY);
            textView.setText(this.h.c(null, str, str2, null));
            textView.setVisibility(0);
        }
    }

    public final boolean e() {
        if (this.a.getVisibility() != 8 && this.a.getVisibility() != 4) {
            return false;
        }
        if (this.b.getVisibility() == 8 || this.b.getVisibility() == 4) {
            return this.c.getVisibility() == 8 || this.c.getVisibility() == 4;
        }
        return false;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.rich_card_title);
        this.b = (TextView) findViewById(R.id.rich_card_description);
        this.c = (LinearLayout) findViewById(R.id.rich_card_suggestions_container);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
        if (this.e) {
            int measuredHeight = getMeasuredHeight();
            GeneralPurposeRichCard generalPurposeRichCard = ((ConversationRichCardView) this.d).h;
            generalPurposeRichCard.getClass();
            int i3 = generalPurposeRichCard.layout.desiredHeight;
            boolean z = i3 == -1;
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.rich_card_max_height);
            if (z) {
                i3 = dimensionPixelOffset + 3;
            }
            RichCardMediaAttachmentView richCardMediaAttachmentView = ((ConversationRichCardView) this.d).k;
            int max = Math.max(0, i3 - (richCardMediaAttachmentView == null ? 0 : richCardMediaAttachmentView.getLayoutParams().height));
            if (max == 0 || (e() && z)) {
                setMeasuredDimension(0, 0);
                return;
            }
            if (measuredHeight > max) {
                measuredHeight = f(this.a, max, f(this.b, max, measuredHeight));
                int childCount = this.c.getChildCount() - 1;
                while (true) {
                    if (childCount < 0 || measuredHeight <= max) {
                        break;
                    }
                    int measuredHeight2 = this.c.getMeasuredHeight();
                    if (childCount == 0) {
                        this.c.setVisibility(8);
                        measuredHeight -= measuredHeight2;
                        break;
                    }
                    View childAt = this.c.getChildAt(childCount);
                    if (childAt != null && childAt.getVisibility() != 8) {
                        childAt.setVisibility(8);
                        LinearLayout linearLayout = this.c;
                        linearLayout.measure(csmj.c(linearLayout), csmj.b(this.c));
                        measuredHeight -= measuredHeight2 - this.c.getMeasuredHeight();
                    }
                    childCount--;
                }
                if (this.c.getVisibility() == 8 && getPaddingBottom() == 0) {
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.rich_card_edge_padding);
                    setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), dimensionPixelSize);
                    measuredHeight += dimensionPixelSize;
                }
                if (this.b.getVisibility() != 8 && measuredHeight > max) {
                    measuredHeight -= this.b.getMeasuredHeight();
                    this.b.setVisibility(8);
                }
                if (this.a.getVisibility() != 8 && measuredHeight > max) {
                    measuredHeight -= this.b.getMeasuredHeight();
                    this.a.setVisibility(8);
                }
            }
            if (!z && this.e && this.c.getVisibility() == 0) {
                LinearLayout linearLayout2 = this.c;
                linearLayout2.measure(csmj.d(linearLayout2), View.MeasureSpec.makeMeasureSpec((max - measuredHeight) + this.c.getMeasuredHeight(), 1073741824));
            } else {
                max = measuredHeight;
            }
            setMeasuredDimension(View.MeasureSpec.getSize(i), max);
        }
    }
}
