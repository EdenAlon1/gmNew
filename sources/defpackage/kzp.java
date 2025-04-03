package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.ui.conversation.message.statuschangelist.MessageStatusListFragment;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzp extends kzo {
    protected int[] a;
    protected final int[] e;
    final String[] f;
    public czms g;
    private final int h;

    public kzp(Context context, String[] strArr, int[] iArr) {
        super(context);
        this.h = -1;
        this.e = iArr;
        this.f = strArr;
        d(null, strArr);
    }

    private final void d(Cursor cursor, String[] strArr) {
        if (cursor == null || strArr == null) {
            this.a = null;
            return;
        }
        if (this.a == null) {
            this.a = new int[2];
        }
        for (int i = 0; i < 2; i++) {
            this.a[i] = cursor.getColumnIndexOrThrow(strArr[i]);
        }
    }

    @Override // defpackage.kzl, defpackage.kzm
    public final CharSequence c(Cursor cursor) {
        return (this.h < 0 || cursor == null) ? cursor == null ? "" : cursor.toString() : cursor.getString(0);
    }

    @Override // defpackage.kzl
    public final void f(View view, Cursor cursor) {
        int[] iArr;
        String d;
        int[] iArr2 = this.e;
        if (iArr2 == null || (iArr = this.a) == null) {
            throw new IllegalStateException("The `to` and `from` arrays must be non-null and of equal length for binding to occur");
        }
        czms czmsVar = this.g;
        for (int i = 0; i < 2; i++) {
            View findViewById = view.findViewById(iArr2[i]);
            if (findViewById != null) {
                if (czmsVar != null) {
                    int i2 = iArr[i];
                    bunm bunmVar = (bunm) cursor;
                    int columnIndex = cursor.getColumnIndex(buoc.c.c.toString());
                    MessageStatusListFragment messageStatusListFragment = czmsVar.a;
                    if (i2 == columnIndex) {
                        TextView textView = (TextView) findViewById;
                        long e = bunmVar.e() - messageStatusListFragment.am;
                        long hours = TimeUnit.MILLISECONDS.toHours(e);
                        long minutes = TimeUnit.MILLISECONDS.toMinutes(e) % TimeUnit.HOURS.toMinutes(1L);
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(e) % TimeUnit.MINUTES.toSeconds(1L);
                        long millis = e % TimeUnit.SECONDS.toMillis(1L);
                        textView.setText(hours > 0 ? String.format(Locale.US, "%1d:%02d:%02d:%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(millis)) : String.format(Locale.US, "%01d:%02d:%03d", Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(millis)));
                    } else if (i2 == cursor.getColumnIndex(buoc.c.d.toString())) {
                        int i3 = cursor.getInt(cursor.getColumnIndex("table_source"));
                        int c = bunmVar.c();
                        if (i3 != 1) {
                            d = null;
                            if (i3 == 2) {
                                try {
                                    aliq[] values = aliq.values();
                                    if (c >= values.length) {
                                        throw new IllegalArgumentException();
                                    }
                                    d = messageStatusListFragment.ak.c(values[c], bunmVar.g());
                                } catch (IllegalArgumentException unused) {
                                }
                            }
                        } else {
                            d = c >= 0 ? messageStatusListFragment.aj.d(c, bunmVar.g()) : messageStatusListFragment.aj.c(bunmVar.f());
                        }
                        String g = bunmVar.g();
                        if (true == TextUtils.isEmpty(d)) {
                            d = g;
                        }
                        ((TextView) findViewById).setText(d);
                    }
                }
                String string = cursor.getString(iArr[i]);
                if (string == null) {
                    string = "";
                }
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(string);
                } else {
                    if (!(findViewById instanceof ImageView)) {
                        throw new IllegalStateException(String.valueOf(findViewById.getClass().getName()).concat(" is not a  view that can be bounds by this SimpleCursorAdapter"));
                    }
                    ImageView imageView = (ImageView) findViewById;
                    try {
                        imageView.setImageResource(Integer.parseInt(string));
                    } catch (NumberFormatException unused2) {
                        imageView.setImageURI(Uri.parse(string));
                    }
                }
            }
        }
    }

    @Override // defpackage.kzl
    public final Cursor h(Cursor cursor) {
        d(cursor, this.f);
        return super.h(cursor);
    }
}
