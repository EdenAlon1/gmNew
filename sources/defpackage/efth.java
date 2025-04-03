package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efth extends vk {
    public engw a;
    public final efti d;
    private final String e;

    public efth(efti eftiVar, String str) {
        int i = engw.d;
        this.a = enou.a;
        this.d = eftiVar;
        this.e = str;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new eftg(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_country_code, viewGroup, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        eftg eftgVar = (eftg) wrVar;
        final efto eftoVar = (efto) this.a.get(i);
        Context context = eftgVar.a.getContext();
        eftgVar.s.setText(eftoVar.b);
        eftgVar.t.setText(context.getString(R.string.country_code_format, String.valueOf(eftoVar.d)));
        eftgVar.t.setSelected(true);
        boolean equals = TextUtils.equals(eftoVar.c, this.e);
        eftgVar.s.setTypeface(null, equals ? 1 : 0);
        eftgVar.t.setTypeface(null, equals ? 1 : 0);
        eftgVar.a.setOnClickListener(new View.OnClickListener() { // from class: eftf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dczp dczpVar = efth.this.d.a.ah;
                efto eftoVar2 = dczpVar.d;
                efto eftoVar3 = eftoVar;
                if (eftoVar2 != null && !eftoVar2.c.equals(eftoVar3.c)) {
                    ((altk) dczpVar.b.b()).U(epgr.RCS_PROVISIONING_MANUAL_MSISDN_COUNTRY_CHANGED, epgt.PROVISIONING_UI_TYPE_MANUAL_MSISDN_ENTRY);
                }
                Intent intent = new Intent();
                intent.putExtra("com.google.android.apps.messaging.ui.rcs.setup.manual.extra.COUNTRY_CODE_SELECTED", eftoVar3.toByteArray());
                dczpVar.a.setResult(-1, intent);
                dczpVar.a.finish();
            }
        });
    }
}
