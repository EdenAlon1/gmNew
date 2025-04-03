package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drdz extends vk {
    public final dqkk a;
    public final ffji d;
    public List e;

    public drdz(dqkk dqkkVar, ffji ffjiVar) {
        this.a = dqkkVar;
        this.d = ffjiVar;
    }

    @Override // defpackage.vk
    public final int a() {
        List list = this.e;
        if (list == null) {
            ffkj.c("categories");
            list = null;
        }
        return list.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gifsticker_category_item_layout, viewGroup, false);
        inflate.getClass();
        return new drdy(this, inflate);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        drdy drdyVar = (drdy) wrVar;
        drdyVar.getClass();
        List list = this.e;
        if (list == null) {
            ffkj.c("categories");
            list = null;
        }
        final dref drefVar = (dref) list.get(i);
        drefVar.getClass();
        ImageView imageView = drdyVar.t;
        qqs e = qpt.e(imageView);
        e.k(imageView);
        e.i(drefVar.c).v(drdyVar.t);
        drdyVar.u.setText(ffdx.aA(ffpc.V(drefVar.b, new String[]{" "}, 0, 6), " ", null, null, new ffji() { // from class: drdw
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                String str = (String) obj;
                int i2 = drdy.w;
                str.getClass();
                Locale locale = Locale.getDefault();
                locale.getClass();
                if (str.length() <= 0) {
                    return str;
                }
                char charAt = str.charAt(0);
                if (!Character.isLowerCase(charAt)) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                char titleCase = Character.toTitleCase(charAt);
                if (titleCase != Character.toUpperCase(charAt)) {
                    sb.append(titleCase);
                } else {
                    String substring = str.substring(0, 1);
                    substring.getClass();
                    String upperCase = substring.toUpperCase(locale);
                    upperCase.getClass();
                    sb.append(upperCase);
                }
                String substring2 = str.substring(1);
                substring2.getClass();
                sb.append(substring2);
                return sb.toString();
            }
        }, 30));
        View view = drdyVar.s;
        final drdz drdzVar = drdyVar.v;
        view.setContentDescription(drefVar.b);
        view.setOnClickListener(drdzVar.a.b("GifCategoriesAdapter.ViewHolder#onClick", new View.OnClickListener() { // from class: drdx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = drdy.w;
                drdz.this.d.invoke(drefVar);
            }
        }));
    }
}
