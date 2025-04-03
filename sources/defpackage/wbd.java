package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.settings.BusinessContactActionView;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wbd extends ArrayAdapter {
    final /* synthetic */ List a;
    final /* synthetic */ BusinessInfoData b;
    final /* synthetic */ List c;
    final /* synthetic */ List d;
    final /* synthetic */ List e;
    final /* synthetic */ List f;
    final /* synthetic */ wbe g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbd(wbe wbeVar, Context context, List list, List list2, BusinessInfoData businessInfoData, List list3, List list4, List list5, List list6) {
        super(context, 0, list);
        this.a = list2;
        this.b = businessInfoData;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        this.f = list6;
        this.g = wbeVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = view;
        if (view == null) {
            View inflate = this.g.fe().getLayoutInflater().inflate(R.layout.business_contact_action, viewGroup, false);
            vzb vzbVar = new vzb();
            vzbVar.a = (TextView) inflate.findViewById(R.id.business_contact_action_header);
            vzbVar.b = (TextView) inflate.findViewById(R.id.business_contact_action_sub_header);
            vzbVar.c = (ImageView) inflate.findViewById(R.id.business_contact_action_icon);
            vzbVar.d = inflate.findViewById(R.id.business_contact_action_group_divider);
            vzbVar.e = inflate.findViewById(R.id.business_contact_action_row);
            inflate.setTag(vzbVar);
            view2 = inflate;
        }
        BusinessInfoProperty businessInfoProperty = (BusinessInfoProperty) this.a.get(i);
        String value = businessInfoProperty.getValue();
        aoku a = ((aolr) this.g.d.b()).a(this.b.getRbmBotId());
        crjo a2 = this.c.contains(businessInfoProperty) ? this.g.a.a(a, value) : this.d.contains(businessInfoProperty) ? this.g.c.a(a, value) : this.e.contains(businessInfoProperty) ? this.g.b.a(a, value) : null;
        String header = businessInfoProperty.getHeader();
        String subHeader = businessInfoProperty.getSubHeader();
        BusinessContactActionView businessContactActionView = (BusinessContactActionView) view2;
        if (this.f.contains(Integer.valueOf(i))) {
            businessContactActionView.a(a2, header, subHeader, true);
            return view2;
        }
        businessContactActionView.a(a2, header, subHeader, false);
        return view2;
    }
}
