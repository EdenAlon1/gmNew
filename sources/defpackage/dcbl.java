package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcbl extends vk {
    public final CustomizationModel a;
    public final aai d;
    private final Context e;
    private final float f;
    private final float g;
    private final Map h;
    private final Map i;

    public dcbl(Context context, CustomizationModel customizationModel) {
        EnumMap enumMap = new EnumMap(eymn.class);
        this.h = enumMap;
        EnumMap enumMap2 = new EnumMap(eymn.class);
        this.i = enumMap2;
        this.e = context;
        this.a = customizationModel;
        this.f = context.getResources().getFraction(R.fraction.c2o_customization_category_disabled_alpha, 1, 1);
        this.g = context.getResources().getFraction(R.fraction.c2o_customization_category_enabled_alpha, 1, 1);
        this.d = new aai(new dcbi(this));
        enumMap.put((EnumMap) eymn.EMOJI, (eymn) Integer.valueOf(R.drawable.ic_insert_emoticon_white));
        eymn eymnVar = eymn.STICKER;
        Integer valueOf = Integer.valueOf(R.drawable.ic_insert_sticker_white);
        enumMap.put((EnumMap) eymnVar, (eymn) valueOf);
        enumMap.put((EnumMap) eymn.GALLERY, (eymn) Integer.valueOf(R.drawable.ic_insert_photo_white));
        enumMap.put((EnumMap) eymn.LOCATION, (eymn) Integer.valueOf(R.drawable.quantum_gm_ic_location_on_white_24));
        enumMap.put((EnumMap) eymn.GIF, (eymn) Integer.valueOf(R.drawable.ic_insert_gif_white));
        enumMap.put((EnumMap) eymn.EXPRESSIVE_STICKER, (eymn) valueOf);
        enumMap.put((EnumMap) eymn.CONTACT, (eymn) Integer.valueOf(R.drawable.quantum_gm_ic_person_white_24));
        enumMap.put((EnumMap) eymn.FILE, (eymn) Integer.valueOf(R.drawable.quantum_ic_attachment_white_24));
        enumMap2.put((EnumMap) eymn.EMOJI, (eymn) Integer.valueOf(R.string.c2o_category_name_emojis));
        eymn eymnVar2 = eymn.STICKER;
        Integer valueOf2 = Integer.valueOf(R.string.c2o_category_name_stickers);
        enumMap2.put((EnumMap) eymnVar2, (eymn) valueOf2);
        enumMap2.put((EnumMap) eymn.GALLERY, (eymn) Integer.valueOf(R.string.c2o_category_name_gallery));
        enumMap2.put((EnumMap) eymn.LOCATION, (eymn) Integer.valueOf(R.string.c2o_category_name_location));
        enumMap2.put((EnumMap) eymn.GIF, (eymn) Integer.valueOf(R.string.c2o_category_name_gif));
        enumMap2.put((EnumMap) eymn.EXPRESSIVE_STICKER, (eymn) valueOf2);
        enumMap2.put((EnumMap) eymn.CONTACT, (eymn) Integer.valueOf(R.string.c2o_category_name_contact));
        enumMap2.put((EnumMap) eymn.FILE, (eymn) Integer.valueOf(R.string.c2o_contact_share_file_text));
    }

    @Override // defpackage.vk
    public final int a() {
        return this.a.a() - 1;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new dcbk(this, LayoutInflater.from(this.e).inflate(R.layout.compose2o_customization_draggable_item_view, viewGroup, false));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        dcbk dcbkVar = (dcbk) wrVar;
        eymp b = this.a.b(i);
        if (b.d) {
            dcbkVar.a.setOnTouchListener(dcbkVar);
            dcbkVar.u.setAlpha(this.g);
            dcbkVar.t.setAlpha(this.g);
            dcbkVar.s.setAlpha(this.g);
            dcbkVar.v.setEnabled(true);
            dcbkVar.v.setOnCheckedChangeListener(new dcbj(this, i));
        } else {
            dcbkVar.a.setOnTouchListener(null);
            dcbkVar.u.setAlpha(this.f);
            dcbkVar.t.setAlpha(this.f);
            dcbkVar.s.setAlpha(this.f);
            dcbkVar.v.setEnabled(false);
            dcbkVar.v.setOnCheckedChangeListener(null);
        }
        TextView textView = dcbkVar.u;
        eymn b2 = eymn.b(b.b);
        if (b2 == null) {
            b2 = eymn.UNRECOGNIZED;
        }
        textView.setText(this.i.containsKey(b2) ? ((Integer) this.i.get(b2)).intValue() : 0);
        Switch r7 = dcbkVar.v;
        eymq b3 = eymq.b(b.c);
        if (b3 == null) {
            b3 = eymq.UNRECOGNIZED;
        }
        r7.setChecked(b3 == eymq.VISIBLE);
        ImageView imageView = dcbkVar.t;
        eymn b4 = eymn.b(b.b);
        if (b4 == null) {
            b4 = eymn.UNRECOGNIZED;
        }
        imageView.setImageResource(this.h.containsKey(b4) ? ((Integer) this.h.get(b4)).intValue() : 0);
    }
}
