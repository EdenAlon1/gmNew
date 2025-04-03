package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.avatar.ContactAvatarView;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eadq extends LinearLayout implements eads {
    public final ContactAvatarView a;
    public final TextView b;
    public final MaterialButton c;
    public final ImageButton d;

    public eadq(Context context) {
        super(dzyd.a(context, fdql.i()), null, R.attr.textStatusBarStyle);
        inflate(getContext(), R.layout.avatar_status_bar_layout, this);
        this.a = (ContactAvatarView) findViewById(R.id.contact_avatar);
        TextView textView = (TextView) findViewById(R.id.status_content);
        this.b = textView;
        MaterialButton materialButton = (MaterialButton) findViewById(R.id.action_button);
        this.c = materialButton;
        this.d = (ImageButton) findViewById(R.id.end_icon);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, eadr.a, R.attr.textStatusBarStyle, R.style.Default);
        boolean c = dzyd.c(getContext());
        int color = obtainStyledAttributes.getColor(c ? 4 : 5, ehdr.b(this, R.attr.colorOnSurfaceVariant));
        int color2 = obtainStyledAttributes.getColor(!c ? 1 : 0, ehdr.b(this, R.attr.colorPrimary));
        int a = ehga.a(R.dimen.m3_sys_elevation_level3, getContext());
        textView.setTextColor(color);
        materialButton.setTextColor(color2);
        materialButton.e(ColorStateList.valueOf(dzyk.b(color2, 64)));
        setBackgroundColor(a);
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.dzya
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        this.c.setBackgroundColor(i);
    }
}
