package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class vzf extends wad {
    protected abstract ea G(vzi vziVar);

    @Override // defpackage.cwqd, defpackage.cwpv, defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.conversation_settings_activity_gm3);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("conversation_id");
            stringExtra.getClass();
            ConversationIdType b = bdgq.b(stringExtra);
            boolean booleanExtra = getIntent().getBooleanExtra("is_group_conversation", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("is_rcs_conversation", false);
            boolean booleanExtra3 = getIntent().getBooleanExtra("is_e2ee_rcs_conversation", false);
            boolean booleanExtra4 = getIntent().getBooleanExtra("has_been_e2ee", false);
            int intExtra = getIntent().getIntExtra("conversation_state", 0);
            int intExtra2 = getIntent().getIntExtra("conversation_send_mode", 0);
            int intExtra3 = getIntent().getIntExtra("conversation_settings_launch_source", 0);
            ayhd b2 = ayhd.b(getIntent().getIntExtra("conversation_error_state", 0));
            if (b2 == null) {
                b2 = ayhd.NONE;
            }
            cskc cskcVar = vzn.a;
            vzh vzhVar = (vzh) vzi.a.createBuilder();
            String a = b.a();
            vzhVar.copyOnWrite();
            vzi vziVar = (vzi) vzhVar.instance;
            a.getClass();
            vziVar.b = a;
            vzhVar.copyOnWrite();
            ((vzi) vzhVar.instance).c = booleanExtra;
            vzhVar.copyOnWrite();
            ((vzi) vzhVar.instance).d = booleanExtra2;
            vzhVar.copyOnWrite();
            ((vzi) vzhVar.instance).e = intExtra;
            vzhVar.copyOnWrite();
            ((vzi) vzhVar.instance).f = b2.a();
            vzhVar.copyOnWrite();
            ((vzi) vzhVar.instance).g = booleanExtra3;
            vzhVar.copyOnWrite();
            ((vzi) vzhVar.instance).h = booleanExtra4;
            vzhVar.copyOnWrite();
            ((vzi) vzhVar.instance).i = intExtra2;
            vzhVar.copyOnWrite();
            ((vzi) vzhVar.instance).j = intExtra3;
            ea G = G((vzi) vzhVar.build());
            cg cgVar = new cg(a());
            cgVar.x(R.id.fragment_container, G, "settings");
            cgVar.c();
        }
        im k = k();
        if (k != null) {
            k.setDisplayHomeAsUpEnabled(true);
        }
        Toolbar eZ = eZ();
        if (eZ != null) {
            eZ.t(new View.OnClickListener() { // from class: vze
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    vzf.this.gE().d();
                }
            });
        }
    }
}
