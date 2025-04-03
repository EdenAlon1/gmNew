package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import androidx.core.app.RemoteActionCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewyx {
    public final List b;
    public final Bundle c;
    private final String e;
    private final ewxv f;
    private final String g;
    private static final IconCompat d = IconCompat.k(new byte[0], 0);
    static final ewyx a = new ewyv().a();

    public ewyx(String str, List list, ewxv ewxvVar, String str2, Bundle bundle) {
        this.e = str;
        this.b = list;
        this.f = ewxvVar;
        this.g = str2;
        this.c = bundle;
    }

    static ewyx b(Context context, TextClassification textClassification) {
        String text;
        int entityCount;
        Intent intent;
        CharSequence label;
        String text2;
        Intent intent2;
        Bundle bundle;
        Drawable icon;
        CharSequence label2;
        Drawable icon2;
        IconCompat g;
        ActivityOptions pendingIntentCreatorBackgroundActivityStartMode;
        List actions;
        String entity;
        float confidenceScore;
        String id;
        textClassification.getClass();
        ewyv ewyvVar = new ewyv();
        text = textClassification.getText();
        ewyvVar.d(text);
        if (Build.VERSION.SDK_INT >= 28) {
            id = textClassification.getId();
            ewyvVar.a = id;
        }
        entityCount = textClassification.getEntityCount();
        for (int i = 0; i < entityCount; i++) {
            entity = textClassification.getEntity(i);
            confidenceScore = textClassification.getConfidenceScore(entity);
            ewyvVar.c(entity, confidenceScore);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            actions = textClassification.getActions();
            Iterator it = actions.iterator();
            while (it.hasNext()) {
                ewyvVar.b(RemoteActionCompat.a(iy$$ExternalSyntheticApiModelOutline1.m408m(it.next())));
            }
        } else {
            intent = textClassification.getIntent();
            if (intent != null) {
                label = textClassification.getLabel();
                if (!TextUtils.isEmpty(label)) {
                    text2 = textClassification.getText();
                    int hashCode = text2.hashCode();
                    intent2 = textClassification.getIntent();
                    if (Build.VERSION.SDK_INT > 34) {
                        pendingIntentCreatorBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentCreatorBackgroundActivityStartMode(1);
                        bundle = pendingIntentCreatorBackgroundActivityStartMode.toBundle();
                    } else {
                        bundle = null;
                    }
                    PendingIntent activity = PendingIntent.getActivity(context, hashCode, intent2, 201326592, bundle);
                    icon = textClassification.getIcon();
                    label2 = textClassification.getLabel();
                    if (icon == null) {
                        g = d;
                    } else {
                        icon2 = textClassification.getIcon();
                        if (icon2 instanceof BitmapDrawable) {
                            g = IconCompat.g(((BitmapDrawable) icon2).getBitmap());
                        } else {
                            Bitmap createBitmap = Bitmap.createBitmap(icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            icon2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                            icon2.draw(canvas);
                            g = IconCompat.g(createBitmap);
                        }
                    }
                    RemoteActionCompat remoteActionCompat = new RemoteActionCompat(g, label2, label2, activity);
                    remoteActionCompat.f = icon != null;
                    ewyvVar.b(remoteActionCompat);
                }
            }
        }
        return ewyvVar.a();
    }

    public final int a() {
        return this.f.a().size();
    }

    public final String c() {
        return (String) this.f.a().get(0);
    }

    public final String toString() {
        return String.format(Locale.US, "TextClassification {text=%s, entities=%s, actions=%s, id=%s}", this.e, this.f, this.b, this.g);
    }
}
