package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dciz implements dcak {
    public final cpn a;
    private final dciw[] b;

    /* compiled from: PG */
    public interface a {
        crjx a();
    }

    public dciz(Context context, dciw dciwVar) {
        int i;
        cpn cpnVar = new cpn();
        this.a = cpnVar;
        crjx a2 = ((a) ekhw.a(context, a.class)).a();
        String[] stringArray = context.getResources().getStringArray(R.array.gif_category_names_tenor);
        String[] stringArray2 = context.getResources().getStringArray(R.array.gif_category_queries_tenor);
        int[] intArray = context.getResources().getIntArray(R.array.gif_category_background_colors);
        int[] intArray2 = context.getResources().getIntArray(R.array.gif_category_text_icon_colors);
        int length = stringArray.length;
        int length2 = stringArray2.length;
        emxf.l(length == length2);
        emxf.l(length == intArray.length);
        emxf.l(length == intArray2.length);
        int i2 = dciwVar != null ? 1 : 0;
        dciw[] dciwVarArr = new dciw[length2 + i2];
        this.b = dciwVarArr;
        if (dciwVar != null) {
            dciwVarArr[0] = dciwVar;
            cpnVar.put(emxe.b(dciwVar.b), 0);
        }
        boolean g = a2.g();
        for (int i3 = 0; i3 < stringArray2.length; i3++) {
            dciw[] dciwVarArr2 = this.b;
            int i4 = i3 + i2;
            String str = stringArray[i3];
            String str2 = stringArray2[i3];
            if (g) {
                ehdr.d(context, R.attr.colorOnSurfaceInverse, "GifCategoryModel");
                i = ehdr.d(context, R.attr.colorOnSurface, "GifCategoryModel");
            } else {
                int i5 = intArray[i3];
                i = intArray2[i3];
            }
            dciwVarArr2[i4] = new dciw(str, str2, i);
            emxf.l(!this.a.containsKey(stringArray2[i3]));
            this.a.put(stringArray2[i3], Integer.valueOf(i4));
        }
    }

    @Override // defpackage.dcak
    public final int a() {
        return this.b.length;
    }

    public final dciw b(int i) {
        return this.b[i];
    }
}
