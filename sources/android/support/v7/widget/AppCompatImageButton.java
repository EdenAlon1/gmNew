package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;
import defpackage.qo;
import defpackage.ra;
import defpackage.yo;
import defpackage.yq;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {
    private final qo a;
    private final ra b;
    private boolean c;

    public AppCompatImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        qo qoVar = this.a;
        if (qoVar != null) {
            qoVar.a();
        }
        ra raVar = this.b;
        if (raVar != null) {
            raVar.b();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return this.b.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        qo qoVar = this.a;
        if (qoVar != null) {
            qoVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        qo qoVar = this.a;
        if (qoVar != null) {
            qoVar.c(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ra raVar = this.b;
        if (raVar != null) {
            raVar.b();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        ra raVar = this.b;
        if (raVar != null && drawable != null && !this.c) {
            raVar.d(drawable);
        }
        super.setImageDrawable(drawable);
        ra raVar2 = this.b;
        if (raVar2 != null) {
            raVar2.b();
            if (this.c) {
                return;
            }
            this.b.a();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.b.e(i);
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ra raVar = this.b;
        if (raVar != null) {
            raVar.b();
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yq.a(context);
        this.c = false;
        yo.d(this, getContext());
        qo qoVar = new qo(this);
        this.a = qoVar;
        qoVar.b(attributeSet, i);
        ra raVar = new ra(this);
        this.b = raVar;
        raVar.c(attributeSet, i);
    }
}
