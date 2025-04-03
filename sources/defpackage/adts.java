package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackActivity;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adts implements adtn {
    private final ffbr a;
    private final ffbr b;

    public adts(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    @Override // defpackage.adtn
    public final Intent a(Context context, adtm adtmVar) {
        final Intent a = akuv.c(context, AdvancedFeedbackActivity.class, "android.intent.action.VIEW").a();
        adtu adtuVar = (adtu) adtmVar;
        a.putExtra("advanced_feedback_config_data", adtuVar.c.k);
        adtuVar.b.ifPresent(new Consumer() { // from class: adtp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                a.putExtra("report_issue_type_value_extra", ((ephv) obj).o);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        adtuVar.a.ifPresent(new Consumer() { // from class: adtq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                a.putExtra("advanced_feedback_throwable_string_key", eerc.a((Throwable) obj));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return a;
    }

    @Override // defpackage.adtn
    public final void b(final Context context, adtm adtmVar) {
        if (!((Boolean) adwg.a.e()).booleanValue()) {
            throw new IllegalStateException("Expect advanced feedback pheontype flag is on");
        }
        final Intent a = a(context, adtmVar);
        final Bitmap bitmap = null;
        if (((adtu) adtmVar).c.equals(eoio.BUGLE_ADVANCED_FEEDBACK_SOURCE_NOTIFICATION_GENERIC)) {
            a.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        } else {
            Activity g = ddzb.g(context);
            if (g != null) {
                bitmap = dgho.a(g);
            }
        }
        if (bitmap == null) {
            context.startActivity(a);
        } else {
            final adyy adyyVar = (adyy) this.a.b();
            elfo.g(new Callable() { // from class: adyw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    File file = new File(adyy.this.a.getCacheDir().getPath(), "temp_feedback_screenshot_" + String.valueOf(UUID.randomUUID()) + ".png");
                    Bitmap bitmap2 = bitmap;
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        bitmap2.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                        return file;
                    } catch (IOException e) {
                        throw new IllegalStateException("Failed to write screenshot to temp file", e);
                    }
                }
            }, adyyVar.b).k(axnw.c(new Consumer() { // from class: adto
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    String path = ((File) obj).getPath();
                    Intent intent = a;
                    intent.putExtra("advanced_feedback_screenshot_key", path);
                    context.startActivity(intent);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), (Executor) this.b.b());
        }
    }

    @Override // defpackage.adtn
    public final void c(final Context context, View view) {
        Button button = (Button) LayoutInflater.from(context).inflate(R.layout.advanced_feedback_launch_button, (ViewGroup) view, true).findViewById(R.id.advanced_feedback_launch_button);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: adtr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    adtt adttVar = new adtt();
                    adttVar.b(eoio.BUGLE_ADVANCED_FEEDBACK_SOURCE_MESSAGE_DETAIL);
                    adts.this.b(context, adttVar.a());
                }
            });
        }
    }
}
