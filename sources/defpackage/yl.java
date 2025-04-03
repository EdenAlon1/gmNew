package defpackage;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yl extends kzo implements View.OnClickListener {
    public int a;
    private final SearchView e;
    private final SearchableInfo f;
    private final Context g;
    private final WeakHashMap h;
    private final int i;
    private ColorStateList j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;

    public yl(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.a = 1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.e = searchView;
        this.f = searchableInfo;
        this.i = searchView.getSuggestionCommitIconResId();
        this.g = context;
        this.h = weakHashMap;
    }

    public static String d(Cursor cursor, String str) {
        return n(cursor, cursor.getColumnIndex(str));
    }

    private final Drawable k(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.h.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private final Drawable l(Uri uri) {
        int parseInt;
        try {
            if (!"android.resource".equals(uri.getScheme())) {
                InputStream openInputStream = this.g.getContentResolver().openInputStream(uri);
                if (openInputStream == null) {
                    throw new FileNotFoundException(a.n(uri, "Failed to open "));
                }
                try {
                    Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                    try {
                        return createFromStream;
                    } catch (IOException e) {
                        return createFromStream;
                    }
                } finally {
                    try {
                        openInputStream.close();
                    } catch (IOException e2) {
                        Log.e("SuggestionsAdapter", a.n(uri, "Error closing icon stream for "), e2);
                    }
                }
            }
            try {
                String authority = uri.getAuthority();
                if (TextUtils.isEmpty(authority)) {
                    Objects.toString(uri);
                    throw new FileNotFoundException("No authority: ".concat(String.valueOf(uri)));
                }
                try {
                    Resources resourcesForApplication = this.g.getPackageManager().getResourcesForApplication(authority);
                    List<String> pathSegments = uri.getPathSegments();
                    if (pathSegments == null) {
                        Objects.toString(uri);
                        throw new FileNotFoundException("No path: ".concat(String.valueOf(uri)));
                    }
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            Objects.toString(uri);
                            throw new FileNotFoundException("Single path segment is not a resource ID: ".concat(String.valueOf(uri)));
                        }
                    } else {
                        if (size != 2) {
                            Objects.toString(uri);
                            throw new FileNotFoundException("More than two path segments: ".concat(String.valueOf(uri)));
                        }
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    Objects.toString(uri);
                    throw new FileNotFoundException("No resource found for: ".concat(String.valueOf(uri)));
                } catch (PackageManager.NameNotFoundException unused2) {
                    Objects.toString(uri);
                    throw new FileNotFoundException("No package found for authority: ".concat(String.valueOf(uri)));
                }
            } catch (Resources.NotFoundException unused3) {
                throw new FileNotFoundException(a.n(uri, "Resource does not exist: "));
            }
        } catch (FileNotFoundException e3) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
        return null;
    }

    private final Drawable m(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.g.getPackageName() + "/" + parseInt;
            Drawable k = k(str2);
            if (k != null) {
                return k;
            }
            Drawable drawable = this.g.getDrawable(parseInt);
            o(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
            return null;
        } catch (NumberFormatException unused2) {
            Drawable k2 = k(str);
            if (k2 != null) {
                return k2;
            }
            Drawable l = l(Uri.parse(str));
            o(str, l);
            return l;
        }
    }

    private static String n(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    private final void o(String str, Drawable drawable) {
        if (drawable != null) {
            this.h.put(str, drawable.getConstantState());
        }
    }

    private static final void p(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private static final void q(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private static final void r(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077 A[Catch: RuntimeException -> 0x007b, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x007b, blocks: (B:9:0x001e, B:13:0x0077, B:17:0x0024, B:20:0x002b, B:22:0x0048, B:23:0x004b, B:25:0x0056, B:26:0x0060, B:27:0x005c), top: B:8:0x001e }] */
    @Override // defpackage.kzl, defpackage.kzm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.database.Cursor a(java.lang.CharSequence r12) {
        /*
            r11 = this;
            java.lang.String r0 = "50"
            java.lang.String r1 = ""
            if (r12 != 0) goto L8
            r12 = r1
            goto Lc
        L8:
            java.lang.String r12 = r12.toString()
        Lc:
            android.support.v7.widget.SearchView r2 = r11.e
            int r2 = r2.getVisibility()
            r3 = 0
            if (r2 != 0) goto L84
            android.support.v7.widget.SearchView r2 = r11.e
            int r2 = r2.getWindowVisibility()
            if (r2 == 0) goto L1e
            goto L84
        L1e:
            android.app.SearchableInfo r2 = r11.f     // Catch: java.lang.RuntimeException -> L7b
            if (r2 != 0) goto L24
        L22:
            r12 = r3
            goto L75
        L24:
            java.lang.String r4 = r2.getSuggestAuthority()     // Catch: java.lang.RuntimeException -> L7b
            if (r4 != 0) goto L2b
            goto L22
        L2b:
            android.net.Uri$Builder r5 = new android.net.Uri$Builder     // Catch: java.lang.RuntimeException -> L7b
            r5.<init>()     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r6 = "content"
            android.net.Uri$Builder r5 = r5.scheme(r6)     // Catch: java.lang.RuntimeException -> L7b
            android.net.Uri$Builder r4 = r5.authority(r4)     // Catch: java.lang.RuntimeException -> L7b
            android.net.Uri$Builder r4 = r4.query(r1)     // Catch: java.lang.RuntimeException -> L7b
            android.net.Uri$Builder r1 = r4.fragment(r1)     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r4 = r2.getSuggestPath()     // Catch: java.lang.RuntimeException -> L7b
            if (r4 == 0) goto L4b
            r1.appendEncodedPath(r4)     // Catch: java.lang.RuntimeException -> L7b
        L4b:
            java.lang.String r4 = "search_suggest_query"
            r1.appendPath(r4)     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r8 = r2.getSuggestSelection()     // Catch: java.lang.RuntimeException -> L7b
            if (r8 == 0) goto L5c
            java.lang.String[] r12 = new java.lang.String[]{r12}     // Catch: java.lang.RuntimeException -> L7b
            r9 = r12
            goto L60
        L5c:
            r1.appendPath(r12)     // Catch: java.lang.RuntimeException -> L7b
            r9 = r3
        L60:
            java.lang.String r12 = "limit"
            r1.appendQueryParameter(r12, r0)     // Catch: java.lang.RuntimeException -> L7b
            android.net.Uri r6 = r1.build()     // Catch: java.lang.RuntimeException -> L7b
            android.content.Context r12 = r11.g     // Catch: java.lang.RuntimeException -> L7b
            android.content.ContentResolver r5 = r12.getContentResolver()     // Catch: java.lang.RuntimeException -> L7b
            r7 = 0
            r10 = 0
            android.database.Cursor r12 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.RuntimeException -> L7b
        L75:
            if (r12 == 0) goto L84
            r12.getCount()     // Catch: java.lang.RuntimeException -> L7b
            return r12
        L7b:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r1, r12)
        L84:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl.a(java.lang.CharSequence):android.database.Cursor");
    }

    @Override // defpackage.kzo, defpackage.kzl
    public final View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        View b = super.b(context, cursor, viewGroup);
        b.setTag(new yk(b));
        ((ImageView) b.findViewById(R.id.edit_query)).setImageResource(this.i);
        return b;
    }

    @Override // defpackage.kzl, defpackage.kzm
    public final CharSequence c(Cursor cursor) {
        String d;
        String d2;
        if (cursor == null) {
            return null;
        }
        String d3 = d(cursor, "suggest_intent_query");
        if (d3 != null) {
            return d3;
        }
        if (this.f.shouldRewriteQueryFromData() && (d2 = d(cursor, "suggest_intent_data")) != null) {
            return d2;
        }
        if (!this.f.shouldRewriteQueryFromText() || (d = d(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return d;
    }

    @Override // defpackage.kzl, defpackage.kzm
    public final void e(Cursor cursor) {
        try {
            super.e(cursor);
            if (cursor != null) {
                this.k = cursor.getColumnIndex("suggest_text_1");
                this.l = cursor.getColumnIndex("suggest_text_2");
                this.m = cursor.getColumnIndex("suggest_text_2_url");
                this.n = cursor.getColumnIndex("suggest_icon_1");
                this.o = cursor.getColumnIndex("suggest_icon_2");
                this.p = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0127  */
    @Override // defpackage.kzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.view.View r18, android.database.Cursor r19) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl.f(android.view.View, android.database.Cursor):void");
    }

    @Override // defpackage.kzl, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View j = j(viewGroup);
            if (j != null) {
                ((yk) j.getTag()).a.setText(e.toString());
            }
            return j;
        }
    }

    @Override // defpackage.kzl, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View b = b(this.g, this.d, viewGroup);
            if (b != null) {
                ((yk) b.getTag()).a.setText(e.toString());
            }
            return b;
        }
    }

    @Override // defpackage.kzl, android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        r(this.d);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        r(this.d);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.e.onQueryRefine((CharSequence) tag);
        }
    }
}
