package com.google.android.apps.messaging.ui.ditto;

import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.MenuItem;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.ditto.DittoNotificationsActivity;
import defpackage.akzt;
import defpackage.ctyx;
import defpackage.cwpw;
import defpackage.dbro;
import defpackage.im;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DittoNotificationsActivity extends dbro {
    public SwitchCompat G;
    public ctyx H;
    public akzt I;
    public Optional J;
    private View K;
    private View L;
    public SwitchCompat n;

    @Override // defpackage.cwpv, defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_ditto_notifications);
        View findViewById = findViewById(R.id.connected_to_web_setting);
        this.K = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: dbqo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DittoNotificationsActivity dittoNotificationsActivity = DittoNotificationsActivity.this;
                boolean isChecked = dittoNotificationsActivity.n.isChecked();
                boolean z = !isChecked;
                dittoNotificationsActivity.H.h("ditto_persistent_notification_channel_pre_o_enabled", z);
                dittoNotificationsActivity.n.setChecked(z);
                dittoNotificationsActivity.I.e("Bugle.Ditto.Notification.Status", true == isChecked ? 2 : 1);
                if (isChecked) {
                    dittoNotificationsActivity.J.ifPresent(new Consumer() { // from class: dbqq
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ((chhm) obj).a();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }
        });
        this.n = (SwitchCompat) findViewById(R.id.connected_to_web_switch_button);
        View findViewById2 = findViewById(R.id.while_using_web_setting);
        this.L = findViewById2;
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: dbqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DittoNotificationsActivity dittoNotificationsActivity = DittoNotificationsActivity.this;
                boolean z = !dittoNotificationsActivity.G.isChecked();
                dittoNotificationsActivity.H.h("ditto_while_connected_notification_channel_enabled", z);
                dittoNotificationsActivity.G.setChecked(z);
            }
        });
        this.G = (SwitchCompat) findViewById(R.id.while_using_web_switch_button);
        im k = k();
        if (k != null) {
            cwpw.c(this, k, R.string.ditto_settings_action_bar_title);
            k.setDisplayHomeAsUpEnabled(true);
        }
        this.n.setChecked(this.H.q("ditto_persistent_notification_channel_pre_o_enabled", true));
        this.G.setChecked(this.H.q("ditto_while_connected_notification_channel_enabled", true));
    }

    @Override // defpackage.cwpv, defpackage.efac, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        gE().d();
        return true;
    }
}
