package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgkf implements adnk {
    public static final cskc a = cskc.g("Lighter", "LighterESITopView");
    public final akvg b;
    public final emwl c;
    private final ekmz d;
    private final ertf e;

    public cgkf(akvg akvgVar, ekmz ekmzVar, ertf ertfVar, emwl emwlVar) {
        this.b = akvgVar;
        this.d = ekmzVar;
        this.e = ertfVar;
        this.c = emwlVar;
    }

    @Override // defpackage.adnk
    public final View a(final LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        viewGroup.getClass();
        View inflate = layoutInflater.inflate(R.layout.lighter_express_sign_in, viewGroup, false);
        inflate.getClass();
        View findViewById = inflate.findViewById(R.id.esi_close_button);
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: cgkd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cgkf.a.m("Lighter ESI close button clicked");
                cgkf.this.c.apply(null);
            }
        });
        inflate.findViewById(R.id.learn_more).setOnClickListener(new View.OnClickListener() { // from class: cgke
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cgkf.this.b.y(layoutInflater.getContext(), (String) cgje.c.e());
            }
        });
        ertf ertfVar = this.e;
        if (ertfVar == null) {
            a.m("BusinessData is null. TopView will show generic business name & logo.");
            return inflate;
        }
        if (!TextUtils.isEmpty(ertfVar.b)) {
            String string = layoutInflater.getContext().getString(R.string.lighter_express_sign_in_title_with_business_name, this.e.b);
            string.getClass();
            ((TextView) inflate.findViewById(R.id.esi_title)).setText(string);
        }
        String str = this.e.c;
        str.getClass();
        if (str.length() != 0) {
            ImageView imageView = (ImageView) inflate.findViewById(R.id.business_avatar_icon);
            imageView.setVisibility(0);
            ((qqo) this.d.g(this.e.c).A()).v(imageView);
            inflate.findViewById(R.id.default_business_avatar_icon_content).setVisibility(8);
        }
        return inflate;
    }

    @Override // defpackage.adnk
    public final /* synthetic */ void b() {
    }
}
